package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_59 {
    private final Production34_59 production = new Production34_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}