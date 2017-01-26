package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_314 {
    private final Production78_314 production = new Production78_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}