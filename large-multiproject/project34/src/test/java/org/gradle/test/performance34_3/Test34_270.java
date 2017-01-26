package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_270 {
    private final Production34_270 production = new Production34_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}