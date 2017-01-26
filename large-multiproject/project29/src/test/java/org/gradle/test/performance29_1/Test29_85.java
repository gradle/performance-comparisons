package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_85 {
    private final Production29_85 production = new Production29_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}