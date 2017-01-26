package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_214 {
    private final Production34_214 production = new Production34_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}