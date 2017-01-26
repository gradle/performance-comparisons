package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_80 {
    private final Production64_80 production = new Production64_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}