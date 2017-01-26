package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_290 {
    private final Production64_290 production = new Production64_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}