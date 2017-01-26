package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_58 {
    private final Production19_58 production = new Production19_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}