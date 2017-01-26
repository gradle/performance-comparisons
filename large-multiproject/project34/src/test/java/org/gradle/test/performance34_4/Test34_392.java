package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_392 {
    private final Production34_392 production = new Production34_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}