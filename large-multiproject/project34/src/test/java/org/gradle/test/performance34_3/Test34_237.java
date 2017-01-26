package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_237 {
    private final Production34_237 production = new Production34_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}