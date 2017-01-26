package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_392 {
    private final Production64_392 production = new Production64_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}