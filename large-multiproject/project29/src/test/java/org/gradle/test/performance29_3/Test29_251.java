package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_251 {
    private final Production29_251 production = new Production29_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}