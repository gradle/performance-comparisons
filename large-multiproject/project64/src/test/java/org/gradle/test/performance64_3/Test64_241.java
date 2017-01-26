package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_241 {
    private final Production64_241 production = new Production64_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}