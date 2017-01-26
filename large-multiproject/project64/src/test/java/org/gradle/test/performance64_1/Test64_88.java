package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_88 {
    private final Production64_88 production = new Production64_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}