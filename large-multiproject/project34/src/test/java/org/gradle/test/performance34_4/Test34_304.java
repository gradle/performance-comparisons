package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_304 {
    private final Production34_304 production = new Production34_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}