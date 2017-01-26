package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_422 {
    private final Production34_422 production = new Production34_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}