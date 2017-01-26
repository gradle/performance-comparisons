package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_423 {
    private final Production34_423 production = new Production34_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}