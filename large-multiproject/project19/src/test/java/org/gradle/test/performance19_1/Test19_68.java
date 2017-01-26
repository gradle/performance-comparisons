package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_68 {
    private final Production19_68 production = new Production19_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}