package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_241 {
    private final Production34_241 production = new Production34_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}