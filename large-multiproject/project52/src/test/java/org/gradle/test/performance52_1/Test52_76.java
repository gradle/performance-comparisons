package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_76 {
    private final Production52_76 production = new Production52_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}