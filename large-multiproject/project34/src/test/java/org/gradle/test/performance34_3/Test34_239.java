package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_239 {
    private final Production34_239 production = new Production34_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}