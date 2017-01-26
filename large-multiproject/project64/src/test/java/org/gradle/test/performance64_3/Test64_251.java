package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_251 {
    private final Production64_251 production = new Production64_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}