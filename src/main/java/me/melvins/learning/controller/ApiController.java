/*
 * 
 */

package me.melvins.learning.controller;

import io.swagger.annotations.ApiOperation;
import me.melvins.learning.pojo.vo.V1ResponseVO;
import me.melvins.learning.pojo.vo.V2ResponseVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MessageFormatMessageFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Api Controller
 *
 * @author Mels
 */
@RestController
@RequestMapping(value = "Api")
public class ApiController {

    private static final Logger LOGGER = LogManager.getLogger(ApiController.class,
            new MessageFormatMessageFactory());

    /**
     * Sample GET Operation.
     *
     * @param headers Request Headers
     * @return {@code V1ResponseVO} wrapped as a {@link ResponseEntity}
     */
    @ApiOperation(value = "OpUsingVendorV1")
    @RequestMapping(value = "Op", method = RequestMethod.GET, produces = {"application/vnd.melvins.v1+json"})
    public ResponseEntity<V1ResponseVO> opUsingVendorV1(@RequestHeader Map<String, Object> headers) {

        LOGGER.debug("Inside API Op v1. Headers {0}", headers);

        V1ResponseVO v1ResponseVO = new V1ResponseVO("v1");

        return new ResponseEntity<>(v1ResponseVO, null, HttpStatus.OK);
    }

    /**
     * Sample GET Operation.
     *
     * @param headers Request Headers
     * @return {@code V1ResponseVO} wrapped as a {@link ResponseEntity}
     */
    @ApiOperation(value = "OpUsingVendorV2")
    @RequestMapping(value = "Op", method = RequestMethod.GET, produces = {"application/vnd.melvins.v2+json"})
    public ResponseEntity<V2ResponseVO> opUsingVendorV2(@RequestHeader Map<String, Object> headers) {

        LOGGER.debug("Inside API Op v2. Headers {0}", headers);

        V2ResponseVO v2ResponseVO = new V2ResponseVO(2);

        return new ResponseEntity<>(v2ResponseVO, null, HttpStatus.OK);
    }

    /**
     * Sample GET Operation.
     *
     * @param headers Request Headers
     * @return {@code V1ResponseVO} wrapped as a {@link ResponseEntity}
     */
    @ApiOperation(value = "OpUsingHeaderV1", produces = "application/json")
    @RequestMapping(value = "Op", method = RequestMethod.GET, headers = "ApiVersion=1")
    public ResponseEntity<V1ResponseVO> opUsingHeadersV1(@RequestHeader Map<String, Object> headers) {

        LOGGER.debug("Inside API Op v1. Headers {0}", headers);

        V1ResponseVO v1ResponseVO = new V1ResponseVO("v1");

        return new ResponseEntity<>(v1ResponseVO, null, HttpStatus.OK);
    }

    /**
     * Sample GET Operation.
     *
     * @param headers Request Headers
     * @return {@code V1ResponseVO} wrapped as a {@link ResponseEntity}
     */
    @ApiOperation(value = "OpUsingHeaderV2", produces = "application/json")
    @RequestMapping(value = "Op", method = RequestMethod.GET, headers = "ApiVersion=2")
    public ResponseEntity<V2ResponseVO> opUsingHeadersV2(@RequestHeader Map<String, Object> headers) {

        LOGGER.debug("Inside API Op v2. Headers {0}", headers);

        V2ResponseVO v2ResponseVO = new V2ResponseVO(2);

        return new ResponseEntity<>(v2ResponseVO, null, HttpStatus.OK);
    }

    /**
     * Sample GET Operation.
     *
     * @param headers Request Headers
     * @return {@code V1ResponseVO} wrapped as a {@link ResponseEntity}
     */
    @ApiOperation(value = "OpUsingUrlV1", produces = "application/json")
    @RequestMapping(value = "Op/v1", method = RequestMethod.GET)
    public ResponseEntity<V1ResponseVO> opUsingUrlV1(@RequestHeader Map<String, Object> headers) {

        LOGGER.debug("Inside API Op v1. Headers {0}", headers);

        V1ResponseVO v1ResponseVO = new V1ResponseVO("v1");

        return new ResponseEntity<>(v1ResponseVO, null, HttpStatus.OK);
    }

    /**
     * Sample GET Operation.
     *
     * @param headers Request Headers
     * @return {@code V1ResponseVO} wrapped as a {@link ResponseEntity}
     */
    @ApiOperation(value = "OpUsingUrlV2", produces = "application/json")
    @RequestMapping(value = "Op/v2", method = RequestMethod.GET)
    public ResponseEntity<V2ResponseVO> opUsingUrlV2(@RequestHeader Map<String, Object> headers) {

        LOGGER.debug("Inside API Op v2. Headers {0}", headers);

        V2ResponseVO v2ResponseVO = new V2ResponseVO(2);

        return new ResponseEntity<>(v2ResponseVO, null, HttpStatus.OK);
    }

}
