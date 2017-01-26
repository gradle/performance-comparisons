package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_100 {
    private final Production64_100 production = new Production64_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}