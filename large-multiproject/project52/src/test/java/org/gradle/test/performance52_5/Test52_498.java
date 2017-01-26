package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_498 {
    private final Production52_498 production = new Production52_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}