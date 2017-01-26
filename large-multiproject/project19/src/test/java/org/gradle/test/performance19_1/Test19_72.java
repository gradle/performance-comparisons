package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_72 {
    private final Production19_72 production = new Production19_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}