package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_68 {
    private final Production29_68 production = new Production29_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}