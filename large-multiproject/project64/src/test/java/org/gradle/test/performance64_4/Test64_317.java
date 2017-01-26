package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_317 {
    private final Production64_317 production = new Production64_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}