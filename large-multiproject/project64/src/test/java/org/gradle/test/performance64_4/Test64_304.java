package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_304 {
    private final Production64_304 production = new Production64_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}