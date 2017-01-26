package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_216 {
    private final Production11_216 production = new Production11_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}