package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_78 {
    private final Production19_78 production = new Production19_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}