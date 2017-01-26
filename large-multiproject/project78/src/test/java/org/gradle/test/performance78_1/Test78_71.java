package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_71 {
    private final Production78_71 production = new Production78_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}