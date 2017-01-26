package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_481 {
    private final Production34_481 production = new Production34_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}