package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_500 {
    private final Production19_500 production = new Production19_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}