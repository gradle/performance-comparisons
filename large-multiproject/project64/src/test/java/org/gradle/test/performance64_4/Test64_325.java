package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_325 {
    private final Production64_325 production = new Production64_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}