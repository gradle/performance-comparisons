package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_388 {
    private final Production64_388 production = new Production64_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}