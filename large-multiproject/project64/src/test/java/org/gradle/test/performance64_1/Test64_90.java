package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_90 {
    private final Production64_90 production = new Production64_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}