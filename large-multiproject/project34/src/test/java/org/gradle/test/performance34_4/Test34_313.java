package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_313 {
    private final Production34_313 production = new Production34_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}