package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_322 {
    private final Production34_322 production = new Production34_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}