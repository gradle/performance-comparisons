package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_226 {
    private final Production34_226 production = new Production34_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}