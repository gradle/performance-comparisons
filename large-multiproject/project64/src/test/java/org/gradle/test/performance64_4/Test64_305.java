package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_305 {
    private final Production64_305 production = new Production64_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}