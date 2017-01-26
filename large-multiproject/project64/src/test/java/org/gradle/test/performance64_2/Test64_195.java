package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_195 {
    private final Production64_195 production = new Production64_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}