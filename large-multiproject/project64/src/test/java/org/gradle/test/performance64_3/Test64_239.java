package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_239 {
    private final Production64_239 production = new Production64_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}