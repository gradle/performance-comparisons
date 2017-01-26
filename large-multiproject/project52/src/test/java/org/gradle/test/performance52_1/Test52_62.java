package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_62 {
    private final Production52_62 production = new Production52_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}