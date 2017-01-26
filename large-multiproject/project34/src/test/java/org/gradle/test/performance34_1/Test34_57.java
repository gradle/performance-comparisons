package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_57 {
    private final Production34_57 production = new Production34_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}