package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_27 {
    private final Production19_27 production = new Production19_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}