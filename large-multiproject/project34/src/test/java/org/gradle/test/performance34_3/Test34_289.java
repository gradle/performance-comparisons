package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_289 {
    private final Production34_289 production = new Production34_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}