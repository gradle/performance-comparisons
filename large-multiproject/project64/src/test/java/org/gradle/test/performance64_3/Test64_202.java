package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_202 {
    private final Production64_202 production = new Production64_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}