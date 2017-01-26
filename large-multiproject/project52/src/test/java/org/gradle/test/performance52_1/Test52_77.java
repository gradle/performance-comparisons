package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_77 {
    private final Production52_77 production = new Production52_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}