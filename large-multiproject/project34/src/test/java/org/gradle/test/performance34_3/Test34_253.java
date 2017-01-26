package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_253 {
    private final Production34_253 production = new Production34_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}