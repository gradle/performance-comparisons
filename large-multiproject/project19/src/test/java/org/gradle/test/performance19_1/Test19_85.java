package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_85 {
    private final Production19_85 production = new Production19_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}