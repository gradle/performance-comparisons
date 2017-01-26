package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_390 {
    private final Production64_390 production = new Production64_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}