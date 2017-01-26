package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_253 {
    private final Production64_253 production = new Production64_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}