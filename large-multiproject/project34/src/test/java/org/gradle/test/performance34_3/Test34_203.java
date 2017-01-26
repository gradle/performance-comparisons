package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_203 {
    private final Production34_203 production = new Production34_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}