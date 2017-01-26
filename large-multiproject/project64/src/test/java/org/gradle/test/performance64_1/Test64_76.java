package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_76 {
    private final Production64_76 production = new Production64_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}