package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_265 {
    private final Production34_265 production = new Production34_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}