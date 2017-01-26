package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_85 {
    private final Production52_85 production = new Production52_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}